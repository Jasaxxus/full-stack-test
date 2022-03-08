--Select the last policy version for each policy

SELECT policy_version.policy_version_number  FROM policy_version, policy WHERE policy.policy_id = policy_version.policy_id;
